package com.bs.mall.dao.impl;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bs.mall.dao.AllContentDao;
import com.bs.mall.mapper.AllContentMapper;
import com.bs.mall.pojo.Activity;
import com.bs.mall.pojo.AllContent;
import com.bs.mall.pojo.Category;
import com.bs.mall.pojo.Collector;
import com.bs.mall.pojo.Comment;
@Repository
public class AllContentDaoImpl implements AllContentDao {
	@Autowired
	private AllContentMapper acm;
//	根据书的id查询所有书和作者，销量的数据
	@Override
	public List<AllContent> referDetailByBookId(Integer bookId) {
		return acm.selectDetailById(bookId);
	}
//	根据书的id查询评论
	@Override
	public List<Comment> referAllfyByBookId(Integer bookId) {
		return acm.selectAllById(bookId);
	}
//	添加收藏
	@Override
	public Integer referAddBook(Integer userId,Integer bookId) {
		return acm.insertAddBook(userId,bookId);
	}

//	判断是否存在
	@Override
	public Collector referCollectorById(Integer userId, Integer bookId) {
		return acm.getIsExist(userId, bookId);
	}
//	分类左侧只显示的分类
	@Override
	public List<Category> referClassifyByBookId() {
		return acm.selectClassifyById();
	}
//	点击分类显示书名，金额
	@Override
	public List<AllContent> referAllBookId(String bookCategory) {
		return acm.selectAllBookId(bookCategory);
	}
//	显示所有书名和图片
	@Override
	public List<AllContent> referAllBook() {
		return acm.selectAllBook();
	}
//	查询书id对应的折扣
	@Override
	public List<Activity> referActivity(Integer bookId) {
		return acm.selectActivity(bookId);
	}
//	查询书的所有作者
	@Override
	public List<AllContent> referAllAuthor(Integer bookId) {
		return acm.selectAllAuthor(bookId);
	}
//	添加评论
	@Override
	public Integer referAllCommentAdd(Integer userId,Integer bookId,String commentContent) {
		return acm.insertAddComment(userId, bookId, commentContent, DateFormat.getDateTimeInstance().format(new Date()));
	}
//	追加评论
	@Override
	public Integer referAllCommentReply(Integer userId, Integer bookId, String commentReply) {
		return acm.updateCommentReply(userId, bookId, commentReply, DateFormat.getDateTimeInstance().format(new Date()));
	}

//	查看库存
	@Override
	public List<AllContent> referStockNum(Integer bookId) {
		return acm.selectStockNum(bookId);
	}



}
