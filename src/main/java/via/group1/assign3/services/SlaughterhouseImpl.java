package via.group1.assign3.services;

import org.lognet.springboot.grpc.GRpcService;

import io.grpc.stub.StreamObserver;
import via.group1.assign3.protobuf.AnimalId;
import via.group1.assign3.protobuf.InvolvedAnimals;
import via.group1.assign3.protobuf.InvolvedProducts;
import via.group1.assign3.protobuf.ProductId;
import via.group1.assign3.protobuf.SlaughterhouseGrpc.SlaughterhouseImplBase;
import via.group1.assign3.repositories.DAO;

@GRpcService
public class SlaughterhouseImpl extends SlaughterhouseImplBase {

    private DAO dao;

    public SlaughterhouseImpl(DAO dao) {
        this.dao = dao;
    }

    @Override
    public void retrieveRegNums(ProductId request, StreamObserver<InvolvedAnimals> responseObserver) {

        InvolvedAnimals involvedAnimals = dao.retrieveRegNums(request);

        responseObserver.onNext(involvedAnimals);
        responseObserver.onCompleted();
    }

    @Override
    public void retrieveProdNums(AnimalId request, StreamObserver<InvolvedProducts> responseObserver) {
        InvolvedProducts involvedProducts = dao.retrieveProdNums(request);

        responseObserver.onNext(involvedProducts);
        responseObserver.onCompleted();
    }
}
