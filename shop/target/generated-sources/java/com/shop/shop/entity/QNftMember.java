package com.shop.shop.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QNftMember is a Querydsl query type for NftMember
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNftMember extends EntityPathBase<NftMember> {

    private static final long serialVersionUID = 2033733272L;

    public static final QNftMember nftMember = new QNftMember("nftMember");

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final EnumPath<com.shop.shop.constant.Role> role = createEnum("role", com.shop.shop.constant.Role.class);

    public final StringPath university = createString("university");

    public QNftMember(String variable) {
        super(NftMember.class, forVariable(variable));
    }

    public QNftMember(Path<? extends NftMember> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNftMember(PathMetadata metadata) {
        super(NftMember.class, metadata);
    }

}

