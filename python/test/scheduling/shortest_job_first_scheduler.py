import unittest

from python.src.scheduling.shortest_job_first_scheduler import ShortestJobFirstScheduler


class ShortestJobFirstSchedulerTest(unittest.TestCase):

    def test_simulation(self):
        n = 100
        scheduler = ShortestJobFirstScheduler(n)

        time_taken = [0] * n
        time_left = [0] * n

        i = 0
        for job in scheduler.jobs:
            time_left[i] = job.time_left
            i += 1

        for i in range(n):
            shortest = 0
            found_shortest = False

            for j in range(n):
                if time_left[j] == 0:
                    continue

                if not found_shortest or time_left[j] < time_left[shortest]:
                    shortest = j
                    found_shortest = True

            time_taken[shortest] += time_left[shortest]
            for j in range(n):
                if shortest == j or time_left[j] == 0:
                    continue

                time_taken[j] += time_left[shortest]

            time_left[shortest] = 0

        self.assertEqual(sum(time_taken), scheduler.simulate())


if __name__ == '__main__':
    unittest.main()
