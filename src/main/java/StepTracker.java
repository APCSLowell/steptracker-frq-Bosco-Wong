import java.util.ArrayList;
public class StepTracker
{
private int max;
 private ArrayList <Integer> data;
 StepTracker(int a) {
  data = new ArrayList <Integer>(); 
  max = a;
 }
 public void addDailySteps(int b){
  data.add(b);
 }
 public int activeDays(){ 
  int count = 0;
  for(int x = 0; x < data.size();x++)
   if(data.get(x) >= max)
    count++; 
  
  return count;
 }
 public double averageSteps(){
  double y = 0.0;
  if(data.size() == 0)
   return y;
  for(int x  = 0; x < data.size(); x++)
   y += data.get(x);
  return y/data.size();
}
}
