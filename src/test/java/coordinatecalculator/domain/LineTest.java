package coordinatecalculator.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LineTest {
    @Test
    void 길이계산_테스트() {
        Points points = new Points(Arrays.asList(new Point("0", "0"), new Point("2", "2")));
        Line line = Line.newInstance(points);

        assertThat(line.calculateResult()).isEqualTo(Math.sqrt(8));
    }
}