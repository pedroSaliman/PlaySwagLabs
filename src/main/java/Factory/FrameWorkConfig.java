package Factory;

import org.aeonbits.owner.Config;

@Config.Sources(value = "file:E:/seleniumprojects/gitendtoend/PlaySwag/src/test/java/resources/FrameWorkConfig.properties")
public interface FrameWorkConfig extends Config {
    String url();
    String fname();
    String lname();
   String username();
   String password();
    String browser();
    String zib();
}
