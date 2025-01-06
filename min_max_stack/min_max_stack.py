class MinMaxStack:
    def __init__(self):
        self.stack = []

    def peek(self):
        if self.is_empty():
            return None
        return self.stack[-1][0]

    def pop(self):
        if self.is_empty():
            return None
        return self.stack.pop()[0]

    def push(self, number):
        if self.is_empty():
            self.stack.append([number, number, number])
        else:
            current_min = self.get_min()
            current_max = self.get_max()
            min = number if current_min > number else current_min
            max = number if current_max < number else current_max
            self.stack.append([number, min, max])

    def get_min(self):
        if self.is_empty():
            return None
        return self.stack[-1][1]

    def get_max(self):
        if self.is_empty():
            return None
        return self.stack[-1][2]

    def is_empty(self):
        if not self.stack:
            return True
        return False
