package wordle.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ResultTest {

    @Test
    void 모든_ResultType이_Matched라면_매칭_성공_여부를_true로_반환한다() {
        Result result = new Result(List.of(ResultType.MATCHED, ResultType.MATCHED));

        assertTrue(result.allMatched());
    }
}