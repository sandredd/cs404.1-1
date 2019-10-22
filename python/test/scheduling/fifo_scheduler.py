import unittest

from python.src.scheduling.fifo_scheduler import FiFoScheduler


class FiFoSchedulerTest(unittest.TestCase):

    def test_simulation(self):
        n = 100
        scheduler = FiFoScheduler(n)

        time_taken = [0] * n
        time_left = [0] * n

        i = 0
        for job in scheduler.jobs:
            time_left[i] = job.time_left
            i += 1

        for i in range(n):
            time_taken[i] += time_left[i]

            for j in range(i + 1, n):
                time_taken[j] += time_left[i]

            time_left[i] = 0

        self.assertEqual(sum(time_taken), scheduler.simulate())


if __name__ == '__main__':
    unittest.main()
