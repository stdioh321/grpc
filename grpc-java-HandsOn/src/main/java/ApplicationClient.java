import generated.APIResponse;
import generated.LoginRequest;
import generated.LoginRequestOrBuilder;
import generated.userGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.ClientResponseObserver;
import io.grpc.stub.StreamObserver;
import service.UserClientService;



public class ApplicationClient {

    public static void main(String[] args) {
        System.out.println("I'm the client.");
        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget("0.0.0.0:50052")
                .usePlaintext()
                .build();

        var userBlockStub= userGrpc.newBlockingStub(managedChannel);
        APIResponse apiResponse= userBlockStub.login(LoginRequest.newBuilder().setPassword("password").setUsername("username").build());

        var userStub = userGrpc.newStub(managedChannel);
        UserClientService userClientService = new UserClientService();
        userStub.login(LoginRequest.newBuilder().setUsername("async").setPassword("async").build(), userClientService);

        System.out.println(apiResponse);
    }
}
