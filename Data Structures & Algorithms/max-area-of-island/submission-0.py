class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        ROWS, COLUMNS = len(grid), len(grid[0])
        seen = set()
        directions = [[-1, 0], [1, 0], [0, -1], [0, 1]]
        max_area = 0

        def bfs(r,c):
            area = 1
            q = deque()
            q.append((r,c))
            seen.add((r,c))
            while q:
                row, col = q.popleft()
                for dr, dc in directions:
                    nr, nc = row + dr, col + dc
                    if (nr in range(ROWS) and
                        nc in range(COLUMNS) and
                        grid[nr][nc] == 1 and
                        (nr, nc) not in seen):
                        q.append((nr,nc))
                        seen.add((nr,nc))
                        area += 1
            return area


        for r in range(ROWS):
            for c in range(COLUMNS):
                if grid[r][c] == 1 and (r, c) not in seen:
                    max_area = max(max_area, bfs(r,c))

        return max_area
