class Solution {

    public class Node{
        int position;
        int speed;
        double Time;
        Node(int position,int speed,int target){
            this.position = position;
            this.speed = speed;
            this.Time = (double)(target-position)/speed;
        }
    }

    public int carFleet(int target, int[] position, int[] speed) {
        ArrayList<Node> cars = new ArrayList<>();
        
        for(int i=0;i<position.length;i++){
            cars.add(new Node(position[i],speed[i],target));
        }
        
        Collections.sort(cars,(a,b)->{
            if(a.position>b.position)return -1;
            else if(a.position<b.position) return 1;
            return 0;
        });

        Stack<Node> st = new Stack<>();

        for(int i=0;i<cars.size();i++){
            Node car = cars.get(i);
            if(st.isEmpty()||st.peek().Time<car.Time){
                st.push(car);
            }
        }

        return st.size();
    }
}