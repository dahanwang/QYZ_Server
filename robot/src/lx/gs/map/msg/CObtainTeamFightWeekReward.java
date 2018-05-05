
package lx.gs.map.msg;

import com.goldhuman.Common.Marshal.OctetsStream;
import com.goldhuman.Common.Marshal.MarshalException;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS

abstract class __CObtainTeamFightWeekReward__ extends xio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CObtainTeamFightWeekReward extends __CObtainTeamFightWeekReward__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 6571230;

	public int getType() {
		return 6571230;
	}

	public int rewardid;

	public CObtainTeamFightWeekReward() {
	}

	public CObtainTeamFightWeekReward(int _rewardid_) {
		this.rewardid = _rewardid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		_os_.marshal(rewardid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		rewardid = _os_.unmarshal_int();
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CObtainTeamFightWeekReward) {
			CObtainTeamFightWeekReward _o_ = (CObtainTeamFightWeekReward)_o1_;
			if (rewardid != _o_.rewardid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += rewardid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(rewardid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CObtainTeamFightWeekReward _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = rewardid - _o_.rewardid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

