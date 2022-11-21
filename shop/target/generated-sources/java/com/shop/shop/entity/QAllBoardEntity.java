package com.shop.shop.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAllBoardEntity is a Querydsl query type for AllBoardEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAllBoardEntity extends EntityPathBase<AllBoardEntity> {

    private static final long serialVersionUID = -1125694426L;

    public static final QAllBoardEntity allBoardEntity = new QAllBoardEntity("allBoardEntity");

    public final QTimeEntity _super = new QTimeEntity(this);

    public final StringPath content = createString("content");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final StringPath title = createString("title");

    public final StringPath writer = createString("writer");

    public QAllBoardEntity(String variable) {
        super(AllBoardEntity.class, forVariable(variable));
    }

    public QAllBoardEntity(Path<? extends AllBoardEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAllBoardEntity(PathMetadata metadata) {
        super(AllBoardEntity.class, metadata);
    }

}

