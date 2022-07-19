package net.anyuruf.membersbasic;

import java.util.List;
import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import MemberBasic;
import Link;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MemberInfo {
    List<MemberBasic> nodes = new ArrayList<>();
    List<Link> links = new ArrayList<>();
}