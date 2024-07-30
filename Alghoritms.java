public class Alghoritms {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(binarySearch(array, 0, array.length - 1, 4));
        int[][] graph = generateRandomGraph(100, 100);
    }

    public static int[][] generateRandomGraph(int n, int m) {
        int[][] graph = new int[n][n];
        for (int i = 0; i < m; i++) {
            int x = (int) (Math.random() * n);
            int y = (int) (Math.random() * n);
            graph[x][y] = 1;
            graph[y][x] = 1;
        }
        return graph;
    }

    public static int dfs(int[][] graph, int start, int target) {
        boolean[] visited = new boolean[graph.length];
        return dfs(graph, start, target, visited);
    }

    public static int dfs(int[][] graph, int start, int target, boolean[] visited) {
        if (start == target) {
            return start;
        }
        visited[start] = true;
        for (int i = 0; i < graph.length; i++) {
            if (graph[start][i] == 1 && !visited[i]) {
                return dfs(graph, i, target, visited);
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (array[mid] == target) {
            return mid;
        }
        if (target > array[mid]) {
            return binarySearch(array, mid + 1, right, target);
        }

        return binarySearch(array, left, mid - 1, target);
    }
}
