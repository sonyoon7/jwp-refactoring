package kitchenpos.core;

public class EmptyRequest {

    private boolean empty;

    public EmptyRequest(boolean empty) {
        this.empty = empty;
    }

    protected EmptyRequest() {
    }

    public boolean isEmpty() {
        return empty;
    }
}
