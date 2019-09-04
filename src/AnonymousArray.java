public class AnonymousArray {

        static void print(int a[])
        {
            for(int i=0;i<a.length;++i)
                System.out.print(a[i]+" ");
        }

        static void print(int a[][])
        {
            for(int i=0;i<a.length;++i)
            {
                for(int j=0;j<a[i].length;++j)
                    System.out.print(a[i][j]+" ");

                System.out.println("");
            }
        }

        public static void main(String...s)
        {
            //1d anonymous array
            print(new int[]{10,20,30,40});

            System.out.println("n");

            //2d anonymous array
            print(new int[][]{{10,20},{30,40},{50,60}});
        }

}
