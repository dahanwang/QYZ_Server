
package lx.gs.leaderboard.msg;

import com.goldhuman.Common.Marshal.OctetsStream;
import com.goldhuman.Common.Marshal.MarshalException;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS

abstract class __CGetRankReward__ extends xio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CGetRankReward extends __CGetRankReward__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 6577524;

	public int getType() {
		return 6577524;
	}

	public int ranktype;

	public CGetRankReward() {
	}

	public CGetRankReward(int _ranktype_) {
		this.ranktype = _ranktype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		_os_.marshal(ranktype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		ranktype = _os_.unmarshal_int();
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CGetRankReward) {
			CGetRankReward _o_ = (CGetRankReward)_o1_;
			if (ranktype != _o_.ranktype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += ranktype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(ranktype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CGetRankReward _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = ranktype - _o_.ranktype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

