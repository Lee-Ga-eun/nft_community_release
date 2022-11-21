package com.shop.shop.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QNftFileEntity is a Querydsl query type for NftFileEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNftFileEntity extends EntityPathBase<NftFileEntity> {

    private static final long serialVersionUID = 335760765L;

    public static final QNftFileEntity nftFileEntity = new QNftFileEntity("nftFileEntity");

    public final StringPath filename = createString("filename");

    public final StringPath filePath = createString("filePath");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath origFilename = createString("origFilename");

    public QNftFileEntity(String variable) {
        super(NftFileEntity.class, forVariable(variable));
    }

    public QNftFileEntity(Path<? extends NftFileEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNftFileEntity(PathMetadata metadata) {
        super(NftFileEntity.class, metadata);
    }

}

