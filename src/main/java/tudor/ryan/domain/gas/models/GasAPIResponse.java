package tudor.ryan.domain.gas.models;

import java.util.List;

public class GasAPIResponse {
    private List<Gas> result;

    public GasAPIResponse() {
    }

    public List<Gas> getResult() {
        return result;
    }

    public void setResult(List<Gas> result) {
        this.result = result;
    }
}
