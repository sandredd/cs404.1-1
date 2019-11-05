import unittest

from python.src.app.scheduling.job import Job


class JobTest(unittest.TestCase):

    def test_turnaround_time(self):
        job = Job()

        time_left = job.time_left
        job.process(time_left)
        job.add_waiting_time(30)

        self.assertEqual(time_left + 30, job.turnaround_time())

    def test_process(self):
        job = Job()
        time_left = job.time_left

        time_slot_a = 1
        job.process(time_slot_a)
        self.assertEqual(time_slot_a, job.turnaround_time())
        self.assertEqual(time_left - time_slot_a, job.time_left)

        time_slot_b = 100
        job.process(time_slot_b)
        self.assertEqual(time_left, job.turnaround_time())
        self.assertTrue(job.is_done())


if __name__ == '__main__':
    unittest.main()
