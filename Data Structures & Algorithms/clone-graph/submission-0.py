"""
# Definition for a Node.
class Node:
    def __init__(self, val = 0, neighbors = None):
        self.val = val
        self.neighbors = neighbors if neighbors is not None else []
"""

class Solution:
    def cloneGraph(self, node: Optional['Node']) -> Optional['Node']:
        if node == None:
            return None

        seen = {}

        def dfs(node):
            if node in seen:
                return seen[node]

            
            new = Node(node.val)
            seen[node] = new

            for neighbor in node.neighbors:
                new.neighbors.append(dfs(neighbor))
            return new

        graph = dfs(node)

        return graph
            
