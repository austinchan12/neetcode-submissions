class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        stack = []
        cars = {}
        for x in range(len(position)):
            cars[position[x]] = speed[x]

        cars = dict(sorted(cars.items(), reverse = True))

        for position, speed in cars.items():
            time = (target - position) / speed

            if not stack or time > stack[-1]:
                stack.append(time)
                
        return len(stack)

        