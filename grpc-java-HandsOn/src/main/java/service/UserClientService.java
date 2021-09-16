package service;

import generated.APIResponse;
import io.grpc.stub.StreamObserver;

public class UserClientService implements StreamObserver<APIResponse> {
    @Override
    public void onNext(APIResponse apiResponse) {
        System.out.println("UserClientService");
        System.out.println(apiResponse);
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onCompleted() {
        System.out.println("UserClientService");
        System.out.println("onCompleted");
    }
}
