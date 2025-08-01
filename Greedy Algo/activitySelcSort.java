import java.util.*;
public class activitySelcSort {
    public static void main(String[] args) {
        int start[]={1,0,1,3,5,5,8};
        int end[]={6,2,4,7,9,9};

        int activities[][]= new int[start.length][3];
        ArrayList<Integer>ans = new ArrayList<>();

        for(int i=0;i<end.length;i++){
            activities[i][0]= i;
            activities[i][1]= start[i];
            activities[i][2]= end[i];
        }
        Arrays.sort(activities, Comparator.comparingDouble(o->o[2]));

        //1st activity
        int maxAct=1;
        ans.add(activities[0][0]);
        int halfEnd= activities[0][2];

        for(int i=0;i<end.length;i++){
            if(activities[i][1]>= halfEnd){
                maxAct++;
                ans.add(activities[i][0]);
                halfEnd = activities[i][2];
            }

        }
        System.out.println("maxAct:"+ maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ ans.get(i)+" ");
        }
    }
    
}
