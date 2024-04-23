import java.util.ArrayList;
public class StepTracker
{
private int max;
 private int days;
 private ArrayList <Double> data;
 StepTracker(int a) {
  days = 0; 
  data = new ArrayList <Double>(); 
  max = a;
 }
 public void addDailySteps(double b){
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
  for(int x  = 0; x < data.size(); x++)
   y += data.get(x);
  return y/data.size();
}
}
