<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD>
    <TITLE> New Document </TITLE>
    <META NAME="Generator" CONTENT="EditPlus">
    <META NAME="Author" CONTENT="">
    <META NAME="Keywords" CONTENT="">
    <META NAME="Description" CONTENT="">
    <STYLE TYPE="TEXT/CSS">
        table {
            text-align:center;
        }
    </STYLE>
</HEAD>
<BODY>
<CENTER>
    <TABLE cellspacing=0 width=500 border=1>
        <#--<THEAD><TR><TD  align="center" colspan=6>2011级《网站涉及与建设》成绩表</TD></TR></THEAD>-->
        <TR>
            <TD>次数</TD>
            <TD>时间</TD>
            <TD>表情</TD>
        </TR>
        <TR>

            <TD>${count!}</TD>
            <TD>${time?string('yyyy-MM-dd hh:mm:ss')}</TD>
            <TD>${studyDomain!""}</TD>
        </TR>
    </TABLE>
</CENTER>
</BODY>
</HTML>