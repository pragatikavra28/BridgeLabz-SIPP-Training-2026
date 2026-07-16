class MovingAverage {

    Queue<Integer> queue;
    int size;
    double sum;

    public MovingAverage(int size) {
        this.size = size;
        queue = new LinkedList<>();
        sum = 0;
    }

    public double next(int val) {

        queue.offer(val);
        sum += val;

        if(queue.size() > size){
            sum -= queue.poll();
        }

        return sum / queue.size();
    }
}