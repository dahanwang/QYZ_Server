
package lx.gs.family.msg;

import lx.gs.family.PRejectRequestJoinF;

import com.goldhuman.Common.Marshal.MarshalException;
import com.goldhuman.Common.Marshal.OctetsStream;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS

abstract class __CRejectRequestJoinF__ extends xio.Protocol { }

/** 拒绝申请
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRejectRequestJoinF extends __CRejectRequestJoinF__ {
	@Override
	protected void process() {
		new PRejectRequestJoinF(this).validateRoleidAndExecute();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 6581037;

	public int getType() {
		return 6581037;
	}

	public long memberid; // 拒绝申请的角色id

	public CRejectRequestJoinF() {
	}

	public CRejectRequestJoinF(long _memberid_) {
		this.memberid = _memberid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		_os_.marshal(memberid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		memberid = _os_.unmarshal_long();
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRejectRequestJoinF) {
			CRejectRequestJoinF _o_ = (CRejectRequestJoinF)_o1_;
			if (memberid != _o_.memberid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)memberid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(memberid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRejectRequestJoinF _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(memberid - _o_.memberid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

