//import java.util.ArrayList;
//
//    public class ArrayListTest
//    {
//        public static void main(String[] args)
//        {
//            ArrayList<String> names = new ArrayList<String>();
//            names.add("Jamal");
//            names.add("Emily");
//            names.add("Destiny");
//            names.add("Mateo");
//
//            //COMPLETE ME: print each name using standard for loop
//            for (int i = 0; i < names.size(); i ++)
//
//            {
//                System.out.println(names.get(i));
//            }
//            //COMPLETE ME: print each name (again!) using enhanced for loop
//            for (String name : names)
//            {
//                System.out.println(name);
//            }
//            //COMPLETE ME: print each name (a third time!) using a while loop
//            int i = 0;
//            while ( i < names.size())
//                    {
//                        System.out.println(names.get(i));
//                        i++;
//                    }
//        }
//    }
import java.util.ArrayList;
import java.util.Arrays; // you need this to use Arrays.asList()

public class ArrayListTest
{
    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        for (int i = 1; i < nums.size() - 1; i++) {
            nums.set(i-1,nums.get(i) + nums.get(i+1));
        }
        System.out.println(nums);

    }


}
