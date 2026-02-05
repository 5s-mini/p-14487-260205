import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void t1() {
        App app = new App();
        int rst = app.plus(1, 2);

        assertThat(rst).isEqualTo(3);
    }
}