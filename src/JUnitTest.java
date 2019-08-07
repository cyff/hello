import org.junit.*;

public class JUnitTest {


        @BeforeClass
        public static void beforeClass(){
            System.out.println("BeforeClass");
        }

        @Before
        public void before(){
            System.out.println("Before");
        }

        @Test
        public void test(){
            System.out.println("Test");
        }

        @Test
        public void test2(){
            System.out.println("Test2");
        }

        @After
        public void after(){
            System.out.println("After");
        }

        @AfterClass
        public static void afterClass(){
            System.out.println("AfterClass");
        }

}
