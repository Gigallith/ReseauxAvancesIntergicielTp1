package Server;

import java.io.Serializable;

/**
 * @author Paul DUPONT
 */
public class ServiceImpl implements Service, Serializable {

    int val = 1;

    @Override
    public int getValue() {
        return val;
    }

    @Override
    public void multiplyBy(int factor) {
        val *= factor;
    }
}
