import java.util.ArrayList;
public class StepTracker
{
 private int min, total, daysActive, days;
public StepTracker(int num){
 min = num;
 daysActive = 0;
 total = 0;
 days = 0;
}
 
 public void addDailySteps(int steps){
  if(steps >= min){
   daysActive++;
  }
  total+=steps;
  days++;
 }

 public int activeDays(){
  return daysActive;
 }

 public double averageSteps(){
  if(days == 0){
   return 0.0;
  }
  return (double)total/days
 }
} 
