import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RqTest {

    @Test
    @DisplayName(value = "명령: 삭제?id=1일 때, rq.getActionName() - 삭제")
    void t1() {
        Rq rq = new Rq("삭제?id=1");
        String actionName = rq.getActionName();
        assertThat(actionName).isEqualTo("삭제");
    }

    @Test
    @DisplayName(value = "명령: 수정?id=1일 때, rq.getActionName() - 수정")
    void t2() {
        Rq rq = new Rq("수정?id=1");
        String actionName = rq.getActionName();
        assertThat(actionName).isEqualTo("수정");
    }

    @Test
    @DisplayName(value = "명령: 목록?keyword=자바일 때, rq.getParam(\"keyword\") -> 자바")
    void t3() {
        Rq rq = new Rq("목록?keyword=자바");
        String actionName = rq.getParam("keyword");
        assertThat(actionName).isEqualTo("자바");
    }

    @Test
    @DisplayName(value = "명령: 목록?keywordType=title일 때, rq.getParam(\"keywordType\") -> \"title\"")
    void t4() {
        Rq rq = new Rq("목록?keywordType=title");
        String actionName = rq.getParam("keywordType");
        assertThat(actionName).isEqualTo("title");
    }
}