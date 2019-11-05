from python.src.app.scheduling.job import Job
from python.src.app.scheduling.scheduler import Scheduler
from python.src.util.minheap import MinHeap


class ShortestJobFirstScheduler(Scheduler):

    def __init__(self, num_jobs):
        self.jobs = MinHeap()

        for i in range(num_jobs):
            self.jobs.insert(Job())

    def simulate(self):
        # TODO: complete this function
        return 0
