
package map.msg;

import com.goldhuman.Common.Marshal.Marshal;
import com.goldhuman.Common.Marshal.OctetsStream;
import com.goldhuman.Common.Marshal.MarshalException;

public class FamilyTeamMember implements Marshal , Comparable<FamilyTeamMember>{
	public long roleid;
	public byte hasbonus;

	public FamilyTeamMember() {
	}

	public FamilyTeamMember(long _roleid_, byte _hasbonus_) {
		this.roleid = _roleid_;
		this.hasbonus = _hasbonus_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		_os_.marshal(roleid);
		_os_.marshal(hasbonus);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		hasbonus = _os_.unmarshal_byte();
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof FamilyTeamMember) {
			FamilyTeamMember _o_ = (FamilyTeamMember)_o1_;
			if (roleid != _o_.roleid) return false;
			if (hasbonus != _o_.hasbonus) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += (int)hasbonus;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(hasbonus).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(FamilyTeamMember _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = hasbonus - _o_.hasbonus;
		if (0 != _c_) return _c_;
		return _c_;
	}

}

