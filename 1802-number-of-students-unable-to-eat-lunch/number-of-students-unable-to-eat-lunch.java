class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        for(int student : students){
            queue.offer(student);
        }

        for(int i = sandwiches.length-1; i>= 0; i--){
            stack.push(sandwiches[i]);
        }

        int count = 0;

        while(!queue.isEmpty() && count < queue.size()){
            if(queue.peek().equals(stack.peek())){
                queue.poll();
                stack.pop();
                count = 0;
            }else{
                queue.offer(queue.poll());
                count++;
            }
        }
        return queue.size();
    }
}