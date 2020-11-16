package kr.or.ddit.member.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.ddit.member.dao.MemberDao;
import kr.or.ddit.member.dao.MemberDaoI;
import kr.or.ddit.member.model.MemberVo;

@Transactional													
@Service("memberService")
public class MemberService implements MemberServiceI{
	
	@Resource(name = "memberDao")
	private MemberDaoI memberDao;
	
	public MemberService() {
		// 주입해 재사용
//		memberDao = new MemberDao();
	}

	@Override
	public MemberVo getMemberInfo(String mem_id){
		return memberDao.getMemberInfo(mem_id);
	}

	@Override
	public int updatePass(MemberVo memberVo){
		return memberDao.updatePass(memberVo);
	}

	@Override
	public int dropMember(MemberVo memberVo){
		return memberDao.dropMember(memberVo);
	}

	@Override
	public int insertMember(MemberVo memberVo) {
		return memberDao.insertMember(memberVo);
	}

}
