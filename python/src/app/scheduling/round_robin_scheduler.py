from python.src.app.scheduling.job import Job
from python.src.app.scheduling.scheduler import Scheduler
from python.src.util.queue import Queue


class RoundRobinScheduler(Scheduler):

    def __init__(self, num_jobs, time_slice):
        self.jobs = Queue()
        self.time_slice = time_slice

        for i in range(num_jobs):
            self.jobs.enqueue(Job())

    def simulate(self):
        # TODO: complete this function
        return 0
