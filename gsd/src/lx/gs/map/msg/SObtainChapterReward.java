
package lx.gs.map.msg;

import com.goldhuman.Common.Marshal.OctetsStream;
import com.goldhuman.Common.Marshal.MarshalException;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS

abstract class __SObtainChapterReward__ extends xio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SObtainChapterReward extends __SObtainChapterReward__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 6583739;

	public int getType() {
		return 6583739;
	}

	public int chapterid;
	public int rewardindex;

	public SObtainChapterReward() {
	}

	public SObtainChapterReward(int _chapterid_, int _rewardindex_) {
		this.chapterid = _chapterid_;
		this.rewardindex = _rewardindex_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		_os_.marshal(chapterid);
		_os_.marshal(rewardindex);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		chapterid = _os_.unmarshal_int();
		rewardindex = _os_.unmarshal_int();
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SObtainChapterReward) {
			SObtainChapterReward _o_ = (SObtainChapterReward)_o1_;
			if (chapterid != _o_.chapterid) return false;
			if (rewardindex != _o_.rewardindex) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += chapterid;
		_h_ += rewardindex;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(chapterid).append(",");
		_sb_.append(rewardindex).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(SObtainChapterReward _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = chapterid - _o_.chapterid;
		if (0 != _c_) return _c_;
		_c_ = rewardindex - _o_.rewardindex;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

