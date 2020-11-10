import org.example.HomeSystem;
import org.example.models.Light;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HomeSystemTest {

    private HomeSystem homeSystem;

    @Before
    public void before(){
        homeSystem = new HomeSystem();

    }

    @Test
    public void thingsEmptyAtInitial(){

        Assert.assertTrue(homeSystem.getThings().isEmpty());
    }
    @Test
    public void addLightSucces(){

        homeSystem.addThing(new Light());
        Assert.assertEquals(1,homeSystem.getThings().size());
    }
    @Test
    public void addTwoLightSucces(){
        homeSystem.addThing(new Light());
        homeSystem.addThing(new Light());
        Assert.assertEquals(2,homeSystem.getThings().size());
    }
    @Test
    public void toggleLightsWhenHomeSystemIsOnSuccess(){
        homeSystem.addThing(new Light());
        homeSystem.addThing(new Light());
        homeSystem.toggleAlllights(true);

        for(Light l : homeSystem.getLights()){
            Assert.assertTrue(l.isLightOn());
        }
    }
    @Test
    public void toggleLightsWhenHomeSystemIsOfFail(){
        homeSystem.addThing(new Light());
        homeSystem.addThing(new Light());
        homeSystem.setState(HomeSystem.State.OFF);

        homeSystem.toggleAlllights(true);

        for(Light l : homeSystem.getLights()){
            Assert.assertFalse(l.isLightOn());
        }

    }
}
