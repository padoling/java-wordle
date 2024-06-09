package wordle.domain;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

public class Result {
    private List<ResultType> resultTypes;

    public Result(List<ResultType> resultTypes) {
        this.resultTypes = resultTypes;
    }

    public boolean allMatched() {
        return resultTypes.stream().allMatch(ResultType.MATCHED::equals);
    }

    public List<ResultType> getResult() {
        return Collections.unmodifiableList(resultTypes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return Objects.equals(resultTypes, result.resultTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultTypes);
    }
}
