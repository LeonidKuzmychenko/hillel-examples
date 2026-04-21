package lk.tech.twentyfive.adapter;

import lk.tech.twentyfive.adapter.old.OldInterface;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OldToNewAdapter implements OldInterface {

    private NewInterface newInterface;

    @Override
    public void specificRequest() {
        newInterface.request();
    }
}
