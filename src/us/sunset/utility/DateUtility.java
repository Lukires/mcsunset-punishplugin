package us.sunset.utility;

import java.util.HashMap;
import java.util.Map;

public class DateUtility
{

    public static String minutesToTimeString(int minutes)
    {

        /*
            #######################################
            # How to over complicate anything 101 #
            #######################################

        HashMap<String, Integer> times = new HashMap<String, Integer>()
        {{

            //Has to be in the order of longest to shortest.
            put("years", 525600);
            put("months", 43200);
            put("days", 1440);
            put("hours", 60);
        }};

        HashMap<String, Integer> timeAmounts = new HashMap<String, Integer>();


        for (String timeKey : times.keySet())
        {
            int time = times.get(timeKey);
            if (minutes>time)
            {
                if (!timeAmounts.containsKey(timeKey))
                {
                    timeAmounts.put(timeKey, 1);
                }

                timeAmounts.put(timeKey, timeAmounts.get(timeKey)+1);
            }
        }

        for (int i = 0; i < timeAmounts.keySet().size(); i++)
        {
            if (timeAmounts.get(timeAmounts.keySet().toArray()[i]) > 0)
            {
                if (timeAmounts.keySet().size()<=i)
                {
                    return timeAmounts.get(timeAmounts.keySet().toArray()[i]+" "+timeAmounts.keySet().toArray()[i]+".0";
                }
                return timeAmounts.get(timeAmounts.keySet().toArray()[i+1]) > 0?
                        timeAmounts.get(timeAmounts.keySet().toArray()[i])+"."+timeAmounts.get(timeAmounts.keySet().toArray()[i+1])/times.get(timeAmounts.keySet().toArray()[i])/times.get(timeAmounts.keySet().toArray()[i+1])+" "+timeAmounts.keySet().toArray()[i]
                        :
                        timeAmounts.get(timeAmounts.keySet().toArray()[i])+".0 "+timeAmounts.keySet().toArray()[i];
            }
        }
         */
        int years = 0;
        int months = 0;
        int days = 0;
        int hours = 0;

        while (minutes > 525600)
        {
            years++;
            minutes-=525600;
        }

        while (minutes > 43200)
        {
            months++;
            minutes-=43200;
        }

        while (minutes > 1440)
        {
            days++;
            minutes-= 1440;
        }

        while (minutes > 60)
        {
            hours++;
            minutes-=60;
        }

        if (years > 0)
        {
            return months>0?years+"."+months/12+" years":years+".0 years";
        }
        if (months > 0)
        {
            return days>0?months+"."+days/30+" months":months+".0 months";
        }
        if (days > 0)
        {
            return hours>0?days+"."+hours/24+" days":days+".0 days";
        }
        if (hours > 0)
        {
            return minutes>0?hours+"."+minutes/60+" hours":days+".0 hours";
        }

        return minutes+".0"+" minutes";



    }
}
