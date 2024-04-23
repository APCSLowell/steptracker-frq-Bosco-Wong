import java.util.ArrayList;
public class StepTracker
{
private int max;
 private int days;
 private ArrayList <Integer> data;
 StepTracker(int x ) {
  days = 0; 
  data = new ArrayList <Integer>(); 
  max = a;
 }
 public void addDailySteps(int b){
  data.add(b);
 }
 public int activeDays(){ 
  for(int x = 0; x < data.size();x++)
   if(data.get(x) >= a)
    count++; 
 }
 public int averageSteps(){
  int y = 0;
  for(int x  = 0; x < data.size(); x++)
   y += data.get(x);
  return y/data.size();
}
}
