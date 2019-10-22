from python.src.scheduling.job import Job
from python.src.scheduling.scheduler import Scheduler
from python.src.util.linkedlist import LinkedList


class FiFoScheduler(Scheduler):

    def __init__(self, num_jobs):
        self.jobs = LinkedList()
        for i in range(num_jobs):
            self.jobs.insert_end(Job())

    def simulate(self):
        # TODO: complete this function
        return 0
