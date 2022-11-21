package com.shop.shop.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QEachUnivBoardEntity is a Querydsl query type for EachUnivBoardEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEachUnivBoardEntity extends EntityPathBase<EachUnivBoardEntity> {

    private static final long serialVersionUID = -1436445340L;

    public static final QEachUnivBoardEntity eachUnivBoardEntity = new QEachUnivBoardEntity("eachUnivBoardEntity");

    public final StringPath author = createString("author");

    public final StringPath content = createString("content");

    public final DateTimePath<java.time.LocalDateTime> createdDate = createDateTime("createdDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> fileId = createNumber("fileId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.time.LocalDateTime> modifiedDate = createDateTime("modifiedDate", java.time.LocalDateTime.class);

    public final StringPath title = createString("title");

    public final StringPath univ = createString("univ");

    public QEachUnivBoardEntity(String variable) {
        super(EachUnivBoardEntity.class, forVariable(variable));
    }

    public QEachUnivBoardEntity(Path<? extends EachUnivBoardEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEachUnivBoardEntity(PathMetadata metadata) {
        super(EachUnivBoardEntity.class, metadata);
    }

}

