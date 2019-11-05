import unittest

from python.src.app.scheduling.round_robin_scheduler import RoundRobinScheduler


class RoundRobinSchedulerTest(unittest.TestCase):

    def all_done(self, time_left):
        for value in time_left:
            if value != 0:
                return False

        return True

    def test_simulation(self):
        n = 100
        time_slice = 20
        scheduler = RoundRobinScheduler(n, time_slice)

        time_taken = [0] * n
        time_left = [0] * n

        i = 0
        for job in scheduler.jobs:
            time_left[i] = job.time_left
            i += 1

        while not self.all_done(time_left):
            i = 0

            for job in scheduler.jobs:
                if time_left[i] == 0:
                    i += 1
                    continue

                time = min(time_left[i], time_slice)
                time_left[i] -= time
                time_taken[i] += time

                for j in range(n):
                    if i == j or time_left[j] == 0:
                        continue

                    time_taken[j] += time

                i += 1

        self.assertEqual(sum(time_taken), scheduler.simulate())


if __name__ == '__main__':
    unittest.main()
