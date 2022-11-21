package com.shop.shop.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QNftCommunityEntity is a Querydsl query type for NftCommunityEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNftCommunityEntity extends EntityPathBase<NftCommunityEntity> {

    private static final long serialVersionUID = 1386776302L;

    public static final QNftCommunityEntity nftCommunityEntity = new QNftCommunityEntity("nftCommunityEntity");

    public final QTimeEntity _super = new QTimeEntity(this);

    public final StringPath content = createString("content");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final NumberPath<Long> fileId = createNumber("fileId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final StringPath title = createString("title");

    public final StringPath univ = createString("univ");

    public final StringPath writer = createString("writer");

    public QNftCommunityEntity(String variable) {
        super(NftCommunityEntity.class, forVariable(variable));
    }

    public QNftCommunityEntity(Path<? extends NftCommunityEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNftCommunityEntity(PathMetadata metadata) {
        super(NftCommunityEntity.class, metadata);
    }

}

