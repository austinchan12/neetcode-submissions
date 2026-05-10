class Solution:
    def islandsAndTreasure(self, grid: List[List[int]]) -> None:
        ROWS, COLUMNS = len(grid), len(grid[0])
        seen = set()
        q = deque()

        def addCell(r,c):
            if (r not in range(ROWS) or
                c not in range(COLUMNS) or
                (r,c) in seen or
                grid[r][c] == -1
                ):
                return
            q.append((r,c))
            seen.add((r,c))


        for r in range(ROWS):
            for c in range(COLUMNS):
                if grid[r][c] == 0:
                    q.append((r,c))
                    seen.add((r,c))

        dist = 0
        while q:
            for _ in range(len(q)):
                r, c = q.popleft()
                grid[r][c] = dist
                addCell(r + 1, c)
                addCell(r - 1, c)
                addCell(r, c + 1)
                addCell(r, c - 1)
            dist += 1