import random


class Job:

    def __init__(self):
        self.time_left = random.randrange(100) + 1
        self.processing_time = 0
        self.waiting_time = 0

    def __lt__(self, other):
        return self.time_left < other.time_left

    def is_done(self):
        return self.time_left == 0

    def turnaround_time(self):
        return self.processing_time + self.waiting_time

    def add_waiting_time(self, time):
        self.waiting_time += time

    def process(self, time_slot):
        time_taken = min(time_slot, self.time_left)
        self.processing_time += time_taken
        self.time_left -= time_taken
