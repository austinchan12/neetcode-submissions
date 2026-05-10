class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        ROWS, COLUMNS = len(grid), len(grid[0])
        visited = set()
        island = 0

        def bfs(r, c):
            q = deque()
            q.append((r,c))
            visited.add((r,c))
            directions = [[1, 0], [-1, 0], [0, 1], [0,-1]]
            while q:
                row, col = q.popleft()
                for vertical, horizontal in directions:
                    nr, nc = row + vertical, col + horizontal
                    if (nr in range(ROWS) and nc in range(COLUMNS) and 
                        (nr, nc) not in visited and
                        grid[nr][nc] == "1"):
                        q.append((nr,nc))
                        visited.add((nr,nc))


        for r in range(ROWS):
            for c in range(COLUMNS):
                if grid[r][c] == "1" and (r,c) not in visited:
                    bfs(r,c)
                    island += 1

        return island
