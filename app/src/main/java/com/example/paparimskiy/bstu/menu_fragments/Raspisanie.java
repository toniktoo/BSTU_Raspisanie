package com.example.paparimskiy.bstu.menu_fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.paparimskiy.bstu.R;
import com.example.paparimskiy.bstu.facultet_A.A131;
import com.example.paparimskiy.bstu.facultet_A.A141;
import com.example.paparimskiy.bstu.facultet_A.A142;
import com.example.paparimskiy.bstu.facultet_A.A151;
import com.example.paparimskiy.bstu.facultet_A.A152;
import com.example.paparimskiy.bstu.facultet_A.A153;
import com.example.paparimskiy.bstu.facultet_A.A161;
import com.example.paparimskiy.bstu.facultet_A.A162;
import com.example.paparimskiy.bstu.facultet_A.A163;
import com.example.paparimskiy.bstu.facultet_A.A171;
import com.example.paparimskiy.bstu.facultet_A.A172;
import com.example.paparimskiy.bstu.facultet_A.A173;
import com.example.paparimskiy.bstu.facultet_A.A181;
import com.example.paparimskiy.bstu.facultet_A.A182;
import com.example.paparimskiy.bstu.facultet_A.A183;
import com.example.paparimskiy.bstu.facultet_A.A184;
import com.example.paparimskiy.bstu.facultet_A.A1M31;
import com.example.paparimskiy.bstu.facultet_A.A341;
import com.example.paparimskiy.bstu.facultet_A.A351;
import com.example.paparimskiy.bstu.facultet_A.A352;
import com.example.paparimskiy.bstu.facultet_A.A353;
import com.example.paparimskiy.bstu.facultet_A.A361;
import com.example.paparimskiy.bstu.facultet_A.A362;
import com.example.paparimskiy.bstu.facultet_A.A363;
import com.example.paparimskiy.bstu.facultet_A.A371;
import com.example.paparimskiy.bstu.facultet_A.A372;
import com.example.paparimskiy.bstu.facultet_A.A373;
import com.example.paparimskiy.bstu.facultet_A.A381;
import com.example.paparimskiy.bstu.facultet_A.A382;
import com.example.paparimskiy.bstu.facultet_A.A383;
import com.example.paparimskiy.bstu.facultet_A.A3M31;
import com.example.paparimskiy.bstu.facultet_A.A3M32;
import com.example.paparimskiy.bstu.facultet_A.A3M41;
import com.example.paparimskiy.bstu.facultet_A.A3M42;
import com.example.paparimskiy.bstu.facultet_A.A3M43;
import com.example.paparimskiy.bstu.facultet_A.BA346;
import com.example.paparimskiy.bstu.facultet_A.BA356;
import com.example.paparimskiy.bstu.facultet_E.BE246;
import com.example.paparimskiy.bstu.facultet_E.BE256;
import com.example.paparimskiy.bstu.facultet_E.BE446;
import com.example.paparimskiy.bstu.facultet_E.BE456;
import com.example.paparimskiy.bstu.facultet_E.BE466;
import com.example.paparimskiy.bstu.facultet_E.E141;
import com.example.paparimskiy.bstu.facultet_E.E142;
import com.example.paparimskiy.bstu.facultet_E.E151;
import com.example.paparimskiy.bstu.facultet_E.E152;
import com.example.paparimskiy.bstu.facultet_E.E153;
import com.example.paparimskiy.bstu.facultet_E.E161;
import com.example.paparimskiy.bstu.facultet_E.E162;
import com.example.paparimskiy.bstu.facultet_E.E163;
import com.example.paparimskiy.bstu.facultet_E.E171;
import com.example.paparimskiy.bstu.facultet_E.E172;
import com.example.paparimskiy.bstu.facultet_E.E173;
import com.example.paparimskiy.bstu.facultet_E.E181;
import com.example.paparimskiy.bstu.facultet_E.E1M31;
import com.example.paparimskiy.bstu.facultet_E.E251;
import com.example.paparimskiy.bstu.facultet_E.E252;
import com.example.paparimskiy.bstu.facultet_E.E261;
import com.example.paparimskiy.bstu.facultet_E.E262;
import com.example.paparimskiy.bstu.facultet_E.E271;
import com.example.paparimskiy.bstu.facultet_E.E272;
import com.example.paparimskiy.bstu.facultet_E.E281;
import com.example.paparimskiy.bstu.facultet_E.E282;
import com.example.paparimskiy.bstu.facultet_E.E2M31;
import com.example.paparimskiy.bstu.facultet_E.E2M41;
import com.example.paparimskiy.bstu.facultet_E.E341;
import com.example.paparimskiy.bstu.facultet_E.E342;
import com.example.paparimskiy.bstu.facultet_E.E351;
import com.example.paparimskiy.bstu.facultet_E.E352;
import com.example.paparimskiy.bstu.facultet_E.E361;
import com.example.paparimskiy.bstu.facultet_E.E362;
import com.example.paparimskiy.bstu.facultet_E.E371;
import com.example.paparimskiy.bstu.facultet_E.E372;
import com.example.paparimskiy.bstu.facultet_E.E381;
import com.example.paparimskiy.bstu.facultet_E.E382;
import com.example.paparimskiy.bstu.facultet_E.E441;
import com.example.paparimskiy.bstu.facultet_E.E451;
import com.example.paparimskiy.bstu.facultet_E.E452;
import com.example.paparimskiy.bstu.facultet_E.E453;
import com.example.paparimskiy.bstu.facultet_E.E461;
import com.example.paparimskiy.bstu.facultet_E.E462;
import com.example.paparimskiy.bstu.facultet_E.E463;
import com.example.paparimskiy.bstu.facultet_E.E464;
import com.example.paparimskiy.bstu.facultet_E.E471;
import com.example.paparimskiy.bstu.facultet_E.E472;
import com.example.paparimskiy.bstu.facultet_E.E473;
import com.example.paparimskiy.bstu.facultet_E.E474;
import com.example.paparimskiy.bstu.facultet_E.E481;
import com.example.paparimskiy.bstu.facultet_E.E482;
import com.example.paparimskiy.bstu.facultet_E.E483;
import com.example.paparimskiy.bstu.facultet_E.E484;
import com.example.paparimskiy.bstu.facultet_E.E4M31;
import com.example.paparimskiy.bstu.facultet_E.E4M41;
import com.example.paparimskiy.bstu.facultet_E.E641;
import com.example.paparimskiy.bstu.facultet_E.E651;
import com.example.paparimskiy.bstu.facultet_E.E652;
import com.example.paparimskiy.bstu.facultet_E.E661;
import com.example.paparimskiy.bstu.facultet_E.E662;
import com.example.paparimskiy.bstu.facultet_E.E671;
import com.example.paparimskiy.bstu.facultet_E.E672;
import com.example.paparimskiy.bstu.facultet_E.E681;
import com.example.paparimskiy.bstu.facultet_E.E682;
import com.example.paparimskiy.bstu.facultet_E.E6M31;
import com.example.paparimskiy.bstu.facultet_E.E6M41;
import com.example.paparimskiy.bstu.facultet_E.E751;
import com.example.paparimskiy.bstu.facultet_E.E761;
import com.example.paparimskiy.bstu.facultet_E.E771;
import com.example.paparimskiy.bstu.facultet_E.E781;
import com.example.paparimskiy.bstu.facultet_E.E782;
import com.example.paparimskiy.bstu.facultet_E.E7M41;
import com.example.paparimskiy.bstu.facultet_I.I152;
import com.example.paparimskiy.bstu.facultet_I.I153;
import com.example.paparimskiy.bstu.facultet_I.I154;
import com.example.paparimskiy.bstu.facultet_I.I161;
import com.example.paparimskiy.bstu.facultet_I.I162;
import com.example.paparimskiy.bstu.facultet_I.I171;
import com.example.paparimskiy.bstu.facultet_I.I172;
import com.example.paparimskiy.bstu.facultet_I.I173;
import com.example.paparimskiy.bstu.facultet_I.I181;
import com.example.paparimskiy.bstu.facultet_I.I182;
import com.example.paparimskiy.bstu.facultet_I.I183;
import com.example.paparimskiy.bstu.facultet_I.I1M31;
import com.example.paparimskiy.bstu.facultet_I.I1M41;
import com.example.paparimskiy.bstu.facultet_I.I251;
import com.example.paparimskiy.bstu.facultet_I.I252;
import com.example.paparimskiy.bstu.facultet_I.I261;
import com.example.paparimskiy.bstu.facultet_I.I262;
import com.example.paparimskiy.bstu.facultet_I.I271;
import com.example.paparimskiy.bstu.facultet_I.I272;
import com.example.paparimskiy.bstu.facultet_I.I281;
import com.example.paparimskiy.bstu.facultet_I.I282;
import com.example.paparimskiy.bstu.facultet_I.I2M31;
import com.example.paparimskiy.bstu.facultet_I.I2M32;
import com.example.paparimskiy.bstu.facultet_I.I2M41;
import com.example.paparimskiy.bstu.facultet_I.I441;
import com.example.paparimskiy.bstu.facultet_I.I442;
import com.example.paparimskiy.bstu.facultet_I.I444;
import com.example.paparimskiy.bstu.facultet_I.I451;
import com.example.paparimskiy.bstu.facultet_I.I452;
import com.example.paparimskiy.bstu.facultet_I.I453;
import com.example.paparimskiy.bstu.facultet_I.I454;
import com.example.paparimskiy.bstu.facultet_I.I455;
import com.example.paparimskiy.bstu.facultet_I.I461;
import com.example.paparimskiy.bstu.facultet_I.I462;
import com.example.paparimskiy.bstu.facultet_I.I463;
import com.example.paparimskiy.bstu.facultet_I.I464;
import com.example.paparimskiy.bstu.facultet_I.I465;
import com.example.paparimskiy.bstu.facultet_I.I471;
import com.example.paparimskiy.bstu.facultet_I.I472;
import com.example.paparimskiy.bstu.facultet_I.I473;
import com.example.paparimskiy.bstu.facultet_I.I474;
import com.example.paparimskiy.bstu.facultet_I.I481;
import com.example.paparimskiy.bstu.facultet_I.I483;
import com.example.paparimskiy.bstu.facultet_I.I484;
import com.example.paparimskiy.bstu.facultet_I.I4M31;
import com.example.paparimskiy.bstu.facultet_I.I4M41;
import com.example.paparimskiy.bstu.facultet_I.I582;
import com.example.paparimskiy.bstu.facultet_I.I584;
import com.example.paparimskiy.bstu.facultet_I.I585;
import com.example.paparimskiy.bstu.facultet_I.I586;
import com.example.paparimskiy.bstu.facultet_I.I587;
import com.example.paparimskiy.bstu.facultet_I.I5M42;
import com.example.paparimskiy.bstu.facultet_I.I851;
import com.example.paparimskiy.bstu.facultet_I.I852;
import com.example.paparimskiy.bstu.facultet_I.I853;
import com.example.paparimskiy.bstu.facultet_I.I861;
import com.example.paparimskiy.bstu.facultet_I.I862;
import com.example.paparimskiy.bstu.facultet_I.I871;
import com.example.paparimskiy.bstu.facultet_I.I872;
import com.example.paparimskiy.bstu.facultet_I.I881;
import com.example.paparimskiy.bstu.facultet_I.I882;
import com.example.paparimskiy.bstu.facultet_I.I8M31;
import com.example.paparimskiy.bstu.facultet_I.I8M32;
import com.example.paparimskiy.bstu.facultet_I.I8m41;
import com.example.paparimskiy.bstu.facultet_I.I941;
import com.example.paparimskiy.bstu.facultet_I.I951;
import com.example.paparimskiy.bstu.facultet_I.I952;
import com.example.paparimskiy.bstu.facultet_I.I953;
import com.example.paparimskiy.bstu.facultet_I.I954;
import com.example.paparimskiy.bstu.facultet_I.I955;
import com.example.paparimskiy.bstu.facultet_I.I956;
import com.example.paparimskiy.bstu.facultet_I.I957;
import com.example.paparimskiy.bstu.facultet_I.I958;
import com.example.paparimskiy.bstu.facultet_I.I961;
import com.example.paparimskiy.bstu.facultet_I.I962;
import com.example.paparimskiy.bstu.facultet_I.I963;
import com.example.paparimskiy.bstu.facultet_I.I964;
import com.example.paparimskiy.bstu.facultet_I.I965;
import com.example.paparimskiy.bstu.facultet_I.I966;
import com.example.paparimskiy.bstu.facultet_I.I967;
import com.example.paparimskiy.bstu.facultet_I.I971;
import com.example.paparimskiy.bstu.facultet_I.I972;
import com.example.paparimskiy.bstu.facultet_I.I973;
import com.example.paparimskiy.bstu.facultet_I.I974;
import com.example.paparimskiy.bstu.facultet_I.I975;
import com.example.paparimskiy.bstu.facultet_I.I976;
import com.example.paparimskiy.bstu.facultet_I.I977;
import com.example.paparimskiy.bstu.facultet_I.I981;
import com.example.paparimskiy.bstu.facultet_I.I983;
import com.example.paparimskiy.bstu.facultet_I.I985;
import com.example.paparimskiy.bstu.facultet_I.I9M31;
import com.example.paparimskiy.bstu.facultet_I.I9M33;
import com.example.paparimskiy.bstu.facultet_I.I9M41;
import com.example.paparimskiy.bstu.facultet_I.ВИ437;
import com.example.paparimskiy.bstu.facultet_I.ВИ947;

public class Raspisanie extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.menu_raspisanie, container, false);
        registerForContextMenu(root.findViewById(R.id.facultet_A));
        registerForContextMenu(root.findViewById(R.id.facultet_I));
        registerForContextMenu(root.findViewById(R.id.facultet_E));
        registerForContextMenu(root.findViewById(R.id.facultet_O));
        registerForContextMenu(root.findViewById(R.id.facultet_P));
        return root;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        switch (v.getId()) {
            case R.id.facultet_A:
                menu.add(Menu.NONE, R.id.a131, Menu.NONE, "A131");
                menu.add(Menu.NONE, R.id.a141, Menu.NONE, "A141");
                menu.add(Menu.NONE, R.id.a142, Menu.NONE, "A142");
                menu.add(Menu.NONE, R.id.a151, Menu.NONE, "A151");
                menu.add(Menu.NONE, R.id.a152, Menu.NONE, "A152");
                menu.add(Menu.NONE, R.id.a153, Menu.NONE, "A153");
                menu.add(Menu.NONE, R.id.a161, Menu.NONE, "A161");
                menu.add(Menu.NONE, R.id.a162, Menu.NONE, "A162");
                menu.add(Menu.NONE, R.id.a163, Menu.NONE, "A163");
                menu.add(Menu.NONE, R.id.a171, Menu.NONE, "A171");
                menu.add(Menu.NONE, R.id.a172, Menu.NONE, "A172");
                menu.add(Menu.NONE, R.id.a173, Menu.NONE, "A173");
                menu.add(Menu.NONE, R.id.a181, Menu.NONE, "A181");
                menu.add(Menu.NONE, R.id.a182, Menu.NONE, "A182");
                menu.add(Menu.NONE, R.id.a183, Menu.NONE, "A183");
                menu.add(Menu.NONE, R.id.a184, Menu.NONE, "A184");
                menu.add(Menu.NONE, R.id.a1m31, Menu.NONE, "A1M31");
                menu.add(Menu.NONE, R.id.a331, Menu.NONE, "A331");
                menu.add(Menu.NONE, R.id.a341, Menu.NONE, "A341");
                menu.add(Menu.NONE, R.id.a351, Menu.NONE, "A351");
                menu.add(Menu.NONE, R.id.a352, Menu.NONE, "A352");
                menu.add(Menu.NONE, R.id.a353, Menu.NONE, "A353");
                menu.add(Menu.NONE, R.id.a361, Menu.NONE, "A361");
                menu.add(Menu.NONE, R.id.a362, Menu.NONE, "A362");
                menu.add(Menu.NONE, R.id.a363, Menu.NONE, "A363");
                menu.add(Menu.NONE, R.id.a371, Menu.NONE, "A371");
                menu.add(Menu.NONE, R.id.a372, Menu.NONE, "A372");
                menu.add(Menu.NONE, R.id.a373, Menu.NONE, "A373");
                menu.add(Menu.NONE, R.id.a381, Menu.NONE, "A381");
                menu.add(Menu.NONE, R.id.a382, Menu.NONE, "A382");
                menu.add(Menu.NONE, R.id.a383, Menu.NONE, "A383");
                menu.add(Menu.NONE, R.id.a3m31, Menu.NONE, "A3M31");
                menu.add(Menu.NONE, R.id.a3m32, Menu.NONE, "A3M32");
                menu.add(Menu.NONE, R.id.a3m41, Menu.NONE, "A3M41");
                menu.add(Menu.NONE, R.id.a3m42, Menu.NONE, "A3M42");
                menu.add(Menu.NONE, R.id.a3m43, Menu.NONE, "A3M43");
                menu.add(Menu.NONE, R.id.va346, Menu.NONE, "BA346");
                menu.add(Menu.NONE, R.id.va356, Menu.NONE, "BA356");
                break;
            case R.id.facultet_I:
                menu.add(Menu.NONE, R.id.i151, Menu.NONE, "И151");
                menu.add(Menu.NONE, R.id.i152, Menu.NONE, "И152");
                menu.add(Menu.NONE, R.id.i153, Menu.NONE, "И153");
                menu.add(Menu.NONE, R.id.i154, Menu.NONE, "И154");
                menu.add(Menu.NONE, R.id.i161, Menu.NONE, "И161");
                menu.add(Menu.NONE, R.id.i162, Menu.NONE, "И162");
                menu.add(Menu.NONE, R.id.i171, Menu.NONE, "И171");
                menu.add(Menu.NONE, R.id.i172, Menu.NONE, "И172");
                menu.add(Menu.NONE, R.id.i173, Menu.NONE, "И173");
                menu.add(Menu.NONE, R.id.i181, Menu.NONE, "И181");
                menu.add(Menu.NONE, R.id.i182, Menu.NONE, "И182");
                menu.add(Menu.NONE, R.id.i183, Menu.NONE, "И183");
                menu.add(Menu.NONE, R.id.i1m31, Menu.NONE, "И1M31");
                menu.add(Menu.NONE, R.id.i1m41, Menu.NONE, "И1M41");
                menu.add(Menu.NONE, R.id.i251, Menu.NONE, "И251");
                menu.add(Menu.NONE, R.id.i252, Menu.NONE, "И252");
                menu.add(Menu.NONE, R.id.i261, Menu.NONE, "И261");
                menu.add(Menu.NONE, R.id.i262, Menu.NONE, "И262");
                menu.add(Menu.NONE, R.id.i271, Menu.NONE, "И271");
                menu.add(Menu.NONE, R.id.i272, Menu.NONE, "И272");
                menu.add(Menu.NONE, R.id.i281, Menu.NONE, "И281");
                menu.add(Menu.NONE, R.id.i282, Menu.NONE, "И282");
                menu.add(Menu.NONE, R.id.i2m31, Menu.NONE, "И2M31");
                menu.add(Menu.NONE, R.id.i2m32, Menu.NONE, "И2M32");
                menu.add(Menu.NONE, R.id.i2m41, Menu.NONE, "И2M41");
                menu.add(Menu.NONE, R.id.i441, Menu.NONE, "И441");
                menu.add(Menu.NONE, R.id.i442, Menu.NONE, "И442");
                menu.add(Menu.NONE, R.id.i444, Menu.NONE, "И444");
                menu.add(Menu.NONE, R.id.i451, Menu.NONE, "И451");
                menu.add(Menu.NONE, R.id.i452, Menu.NONE, "И452");
                menu.add(Menu.NONE, R.id.i453, Menu.NONE, "И453");
                menu.add(Menu.NONE, R.id.i454, Menu.NONE, "И454");
                menu.add(Menu.NONE, R.id.i455, Menu.NONE, "И455");
                menu.add(Menu.NONE, R.id.i461, Menu.NONE, "И461");
                menu.add(Menu.NONE, R.id.i462, Menu.NONE, "И462");
                menu.add(Menu.NONE, R.id.i463, Menu.NONE, "И463");
                menu.add(Menu.NONE, R.id.i464, Menu.NONE, "И464");
                menu.add(Menu.NONE, R.id.i465, Menu.NONE, "И465");
                menu.add(Menu.NONE, R.id.i471, Menu.NONE, "И471");
                menu.add(Menu.NONE, R.id.i472, Menu.NONE, "И472");
                menu.add(Menu.NONE, R.id.i473, Menu.NONE, "И473");
                menu.add(Menu.NONE, R.id.i474, Menu.NONE, "И474");
                menu.add(Menu.NONE, R.id.i481, Menu.NONE, "И481");
                menu.add(Menu.NONE, R.id.i483, Menu.NONE, "И483");
                menu.add(Menu.NONE, R.id.i484, Menu.NONE, "И484");
                menu.add(Menu.NONE, R.id.i4m31, Menu.NONE, "И4M31");
                menu.add(Menu.NONE, R.id.i4m41, Menu.NONE, "И4M41");
                menu.add(Menu.NONE, R.id.i582, Menu.NONE, "И582");
                menu.add(Menu.NONE, R.id.i584, Menu.NONE, "И584");
                menu.add(Menu.NONE, R.id.i585, Menu.NONE, "И585");
                menu.add(Menu.NONE, R.id.i586, Menu.NONE, "И586");
                menu.add(Menu.NONE, R.id.i587, Menu.NONE, "И587");
                menu.add(Menu.NONE, R.id.i5m42, Menu.NONE, "И5M42");
                menu.add(Menu.NONE, R.id.i851, Menu.NONE, "И851");
                menu.add(Menu.NONE, R.id.i852, Menu.NONE, "И852");
                menu.add(Menu.NONE, R.id.i853, Menu.NONE, "И853");
                menu.add(Menu.NONE, R.id.i861, Menu.NONE, "И861");
                menu.add(Menu.NONE, R.id.i862, Menu.NONE, "И862");
                menu.add(Menu.NONE, R.id.i871, Menu.NONE, "И871");
                menu.add(Menu.NONE, R.id.i872, Menu.NONE, "И872");
                menu.add(Menu.NONE, R.id.i881, Menu.NONE, "И881");
                menu.add(Menu.NONE, R.id.i882, Menu.NONE, "И882");
                menu.add(Menu.NONE, R.id.i8m31, Menu.NONE, "И8m31");
                menu.add(Menu.NONE, R.id.i8m32, Menu.NONE, "И8m32");
                menu.add(Menu.NONE, R.id.i8m41, Menu.NONE, "И8m41");
                menu.add(Menu.NONE, R.id.i951, Menu.NONE, "И951");
                menu.add(Menu.NONE, R.id.i952, Menu.NONE, "И952");
                menu.add(Menu.NONE, R.id.i953, Menu.NONE, "И953");
                menu.add(Menu.NONE, R.id.i954, Menu.NONE, "И955");
                menu.add(Menu.NONE, R.id.i956, Menu.NONE, "И956");
                menu.add(Menu.NONE, R.id.i957, Menu.NONE, "И958");
                menu.add(Menu.NONE, R.id.i961, Menu.NONE, "И961");
                menu.add(Menu.NONE, R.id.i962, Menu.NONE, "И962");
                menu.add(Menu.NONE, R.id.i963, Menu.NONE, "И963");
                menu.add(Menu.NONE, R.id.i964, Menu.NONE, "И964");
                menu.add(Menu.NONE, R.id.i965, Menu.NONE, "И965");
                menu.add(Menu.NONE, R.id.i966, Menu.NONE, "И966");
                menu.add(Menu.NONE, R.id.i967, Menu.NONE, "И967");
                menu.add(Menu.NONE, R.id.i971, Menu.NONE, "И971");
                menu.add(Menu.NONE, R.id.i972, Menu.NONE, "И972");
                menu.add(Menu.NONE, R.id.i973, Menu.NONE, "И973");
                menu.add(Menu.NONE, R.id.i974, Menu.NONE, "И974");
                menu.add(Menu.NONE, R.id.i975, Menu.NONE, "И975");
                menu.add(Menu.NONE, R.id.i976, Menu.NONE, "И976");
                menu.add(Menu.NONE, R.id.i977, Menu.NONE, "И977");
                menu.add(Menu.NONE, R.id.i981, Menu.NONE, "И981");
                menu.add(Menu.NONE, R.id.i983, Menu.NONE, "И983");
                menu.add(Menu.NONE, R.id.i985, Menu.NONE, "И985");
                menu.add(Menu.NONE, R.id.i9m31, Menu.NONE, "И9M31");
                menu.add(Menu.NONE, R.id.i9m33, Menu.NONE, "И9M33");
                menu.add(Menu.NONE, R.id.i9m41, Menu.NONE, "И9M41");
                menu.add(Menu.NONE, R.id.vi437, Menu.NONE, "ВИ437");
                menu.add(Menu.NONE, R.id.vi947, Menu.NONE, "ВИ947");
                break;
            case R.id.facultet_E:
                menu.add(Menu.NONE, R.id.e141, Menu.NONE, "E141");
                menu.add(Menu.NONE, R.id.e142, Menu.NONE, "E142");
                menu.add(Menu.NONE, R.id.e151, Menu.NONE, "E151");
                menu.add(Menu.NONE, R.id.e152, Menu.NONE, "E152");
                menu.add(Menu.NONE, R.id.e153, Menu.NONE, "E153");
                menu.add(Menu.NONE, R.id.e161, Menu.NONE, "E161");
                menu.add(Menu.NONE, R.id.e162, Menu.NONE, "E162");
                menu.add(Menu.NONE, R.id.e163, Menu.NONE, "E163");
                menu.add(Menu.NONE, R.id.e171, Menu.NONE, "E171");
                menu.add(Menu.NONE, R.id.e172, Menu.NONE, "E172");
                menu.add(Menu.NONE, R.id.e173, Menu.NONE, "E173");
                menu.add(Menu.NONE, R.id.e181, Menu.NONE, "E181");
                menu.add(Menu.NONE, R.id.e1m31, Menu.NONE, "E1M31");
                menu.add(Menu.NONE, R.id.e251, Menu.NONE, "E251");
                menu.add(Menu.NONE, R.id.e252, Menu.NONE, "E252");
                menu.add(Menu.NONE, R.id.e261, Menu.NONE, "E261");
                menu.add(Menu.NONE, R.id.e271, Menu.NONE, "E271");
                menu.add(Menu.NONE, R.id.e272, Menu.NONE, "E272");
                menu.add(Menu.NONE, R.id.e281, Menu.NONE, "E281");
                menu.add(Menu.NONE, R.id.e282, Menu.NONE, "E282");
                menu.add(Menu.NONE, R.id.e2m31, Menu.NONE, "E2M31");
                menu.add(Menu.NONE, R.id.e2m41, Menu.NONE, "E2M41");
                menu.add(Menu.NONE, R.id.e341, Menu.NONE, "E341");
                menu.add(Menu.NONE, R.id.e342, Menu.NONE, "E342");
                menu.add(Menu.NONE, R.id.e351, Menu.NONE, "E351");
                menu.add(Menu.NONE, R.id.e352, Menu.NONE, "E352");
                menu.add(Menu.NONE, R.id.e361, Menu.NONE, "E361");
                menu.add(Menu.NONE, R.id.e362, Menu.NONE, "E362");
                menu.add(Menu.NONE, R.id.e371, Menu.NONE, "E371");
                menu.add(Menu.NONE, R.id.e372, Menu.NONE, "E372");
                menu.add(Menu.NONE, R.id.e381, Menu.NONE, "E381");
                menu.add(Menu.NONE, R.id.e382, Menu.NONE, "E382");
                menu.add(Menu.NONE, R.id.e441, Menu.NONE, "E441");
                menu.add(Menu.NONE, R.id.e451, Menu.NONE, "E451");
                menu.add(Menu.NONE, R.id.e452, Menu.NONE, "E452");
                menu.add(Menu.NONE, R.id.e453, Menu.NONE, "E453");
                menu.add(Menu.NONE, R.id.e461, Menu.NONE, "E461");
                menu.add(Menu.NONE, R.id.e462, Menu.NONE, "E462");
                menu.add(Menu.NONE, R.id.e463, Menu.NONE, "E463");
                menu.add(Menu.NONE, R.id.e464, Menu.NONE, "E464");
                menu.add(Menu.NONE, R.id.e471, Menu.NONE, "E471");
                menu.add(Menu.NONE, R.id.e472, Menu.NONE, "E472");
                menu.add(Menu.NONE, R.id.e473, Menu.NONE, "E473");
                menu.add(Menu.NONE, R.id.e474, Menu.NONE, "E474");
                menu.add(Menu.NONE, R.id.e481, Menu.NONE, "E481");
                menu.add(Menu.NONE, R.id.e482, Menu.NONE, "E482");
                menu.add(Menu.NONE, R.id.e483, Menu.NONE, "E483");
                menu.add(Menu.NONE, R.id.e484, Menu.NONE, "E484");
                menu.add(Menu.NONE, R.id.e4m31, Menu.NONE, "E4M31");
                menu.add(Menu.NONE, R.id.e4m41, Menu.NONE, "E4M41");
                menu.add(Menu.NONE, R.id.e641, Menu.NONE, "E641");
                menu.add(Menu.NONE, R.id.e651, Menu.NONE, "E651");
                menu.add(Menu.NONE, R.id.e652, Menu.NONE, "E652");
                menu.add(Menu.NONE, R.id.e661, Menu.NONE, "E661");
                menu.add(Menu.NONE, R.id.e662, Menu.NONE, "E662");
                menu.add(Menu.NONE, R.id.e671, Menu.NONE, "E671");
                menu.add(Menu.NONE, R.id.e672, Menu.NONE, "E672");
                menu.add(Menu.NONE, R.id.e381, Menu.NONE, "E681");
                menu.add(Menu.NONE, R.id.e682, Menu.NONE, "E682");
                menu.add(Menu.NONE, R.id.e6m31, Menu.NONE, "E6M31");
                menu.add(Menu.NONE, R.id.e6m41, Menu.NONE, "E6M41");
                menu.add(Menu.NONE, R.id.e751, Menu.NONE, "E751");
                menu.add(Menu.NONE, R.id.e761, Menu.NONE, "E761");
                menu.add(Menu.NONE, R.id.e771, Menu.NONE, "E771");
                menu.add(Menu.NONE, R.id.e781, Menu.NONE, "E781");
                menu.add(Menu.NONE, R.id.e782, Menu.NONE, "E782");
                menu.add(Menu.NONE, R.id.e7m41, Menu.NONE, "E7M41");
                menu.add(Menu.NONE, R.id.ve246, Menu.NONE, "BE246");
                menu.add(Menu.NONE, R.id.ve256, Menu.NONE, "BE256");
                menu.add(Menu.NONE, R.id.ve446, Menu.NONE, "BE446");
                menu.add(Menu.NONE, R.id.ve456, Menu.NONE, "BE456");
                menu.add(Menu.NONE, R.id.ve466, Menu.NONE, "BE466");
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.a131:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A131()).addToBackStack(null).commit();
                return true;
            case R.id.a141:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A141()).addToBackStack(null).commit();
                return true;
            case R.id.a142:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A142()).addToBackStack(null).commit();
                return true;
            case R.id.a151:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A151()).addToBackStack(null).commit();
                return true;
            case R.id.a152:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A152()).addToBackStack(null).commit();
                return true;
            case R.id.a153:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A153()).addToBackStack(null).commit();
                return true;
            case R.id.a161:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A161()).addToBackStack(null).commit();
                return true;
            case R.id.a162:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A162()).addToBackStack(null).commit();
                return true;
            case R.id.a163:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A163()).addToBackStack(null).commit();
                return true;
            case R.id.a171:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A171()).addToBackStack(null).commit();
                return true;
            case R.id.a172:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A172()).addToBackStack(null).commit();
                return true;
            case R.id.a173:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A173()).addToBackStack(null).commit();
                return true;
            case R.id.a181:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A181()).addToBackStack(null).commit();
                return true;
            case R.id.a182:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A182()).addToBackStack(null).commit();
                return true;
            case R.id.a183:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A183()).addToBackStack(null).commit();
                return true;
            case R.id.a184:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A184()).addToBackStack(null).commit();
                return true;
            case R.id.a1m31:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A1M31()).addToBackStack(null).commit();
                return true;
            case R.id.a341:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A341()).addToBackStack(null).commit();
                return true;
            case R.id.a351:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A351()).addToBackStack(null).commit();
                return true;
            case R.id.a352:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A352()).addToBackStack(null).commit();
                return true;
            case R.id.a353:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A353()).addToBackStack(null).commit();
                return true;
            case R.id.a361:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A361()).addToBackStack(null).commit();
                return true;
            case R.id.a362:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A362()).addToBackStack(null).commit();
                return true;
            case R.id.a363:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A363()).addToBackStack(null).commit();
                return true;
            case R.id.a371:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A371()).addToBackStack(null).commit();
                return true;
            case R.id.a372:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A372()).addToBackStack(null).commit();
                return true;
            case R.id.a373:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A373()).addToBackStack(null).commit();
                return true;
            case R.id.a381:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A381()).addToBackStack(null).commit();
                return true;
            case R.id.a382:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A382()).addToBackStack(null).commit();
                return true;
            case R.id.a383:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A383()).addToBackStack(null).commit();
                return true;
            case R.id.a3m31:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A3M31()).addToBackStack(null).commit();
                return true;
            case R.id.a3m32:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A3M32()).addToBackStack(null).commit();
                return true;
            case R.id.a3m41:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A3M41()).addToBackStack(null).commit();
                return true;
            case R.id.a3m42:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A3M42()).addToBackStack(null).commit();
                return true;
            case R.id.a3m43:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new A3M43()).addToBackStack(null).commit();
                return true;
            case R.id.va346:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new BA346()).addToBackStack(null).commit();
                return true;
            case R.id.va356:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new BA356()).addToBackStack(null).commit();
                return true;
            case R.id.i152:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I152()).addToBackStack(null).commit();
                return true;
            case R.id.i153:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I153()).addToBackStack(null).commit();
                return true;
            case R.id.i154:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I154()).addToBackStack(null).commit();
                return true;
            case R.id.i161:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I161()).addToBackStack(null).commit();
                return true;
            case R.id.i162:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I162()).addToBackStack(null).commit();
                return true;
            case R.id.i171:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I171()).addToBackStack(null).commit();
                return true;
            case R.id.i172:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I172()).addToBackStack(null).commit();
                return true;
            case R.id.i173:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I173()).addToBackStack(null).commit();
                return true;
            case R.id.i181:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I181()).addToBackStack(null).commit();
                return true;
            case R.id.i182:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I182()).addToBackStack(null).commit();
                return true;
            case R.id.i183:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I183()).addToBackStack(null).commit();
                return true;
            case R.id.i1m31:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I1M31()).addToBackStack(null).commit();
                return true;
            case R.id.i1m41:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I1M41()).addToBackStack(null).commit();
                return true;
            case R.id.i251:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I251()).addToBackStack(null).commit();
                return true;
            case R.id.i252:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I252()).addToBackStack(null).commit();
                return true;
            case R.id.i261:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I261()).addToBackStack(null).commit();
                return true;
            case R.id.i262:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I262()).addToBackStack(null).commit();
                return true;
            case R.id.i271:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I271()).addToBackStack(null).commit();
                return true;
            case R.id.i272:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I272()).addToBackStack(null).commit();
                return true;
            case R.id.i281:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I281()).addToBackStack(null).commit();
                return true;
            case R.id.i282:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I282()).addToBackStack(null).commit();
                return true;
            case R.id.i2m31:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I2M31()).addToBackStack(null).commit();
                return true;
            case R.id.i2m32:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I2M32()).addToBackStack(null).commit();
                return true;
            case R.id.i2m41:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I2M41()).addToBackStack(null).commit();
                return true;
            case R.id.i441:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I441()).addToBackStack(null).commit();
                return true;
            case R.id.i442:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I442()).addToBackStack(null).commit();
                return true;
            case R.id.i444:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I444()).addToBackStack(null).commit();
                return true;
            case R.id.i451:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I451()).addToBackStack(null).commit();
                return true;
            case R.id.i452:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I452()).addToBackStack(null).commit();
                return true;
            case R.id.i453:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I453()).addToBackStack(null).commit();
                return true;
            case R.id.i454:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I454()).addToBackStack(null).commit();
                return true;
            case R.id.i455:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I455()).addToBackStack(null).commit();
                return true;
            case R.id.i461:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I461()).addToBackStack(null).commit();
                return true;
            case R.id.i462:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I462()).addToBackStack(null).commit();
                return true;
            case R.id.i463:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I463()).addToBackStack(null).commit();
                return true;
            case R.id.i464:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I464()).addToBackStack(null).commit();
                return true;
            case R.id.i465:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I465()).addToBackStack(null).commit();
                return true;
            case R.id.i471:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I471()).addToBackStack(null).commit();
                return true;
            case R.id.i472:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I472()).addToBackStack(null).commit();
                return true;
            case R.id.i473:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I473()).addToBackStack(null).commit();
                return true;
            case R.id.i474:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I474()).addToBackStack(null).commit();
                return true;
            case R.id.i481:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I481()).addToBackStack(null).commit();
                return true;
            case R.id.i483:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I483()).addToBackStack(null).commit();
                return true;
            case R.id.i484:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I484()).addToBackStack(null).commit();
                return true;
            case R.id.i4m31:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I4M31()).addToBackStack(null).commit();
                return true;
            case R.id.i4m41:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I4M41()).addToBackStack(null).commit();
                return true;
            case R.id.i582:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I582()).addToBackStack(null).commit();
                return true;
            case R.id.i584:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I584()).addToBackStack(null).commit();
                return true;
            case R.id.i585:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I585()).addToBackStack(null).commit();
                return true;
            case R.id.i586:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I586()).addToBackStack(null).commit();
                return true;
            case R.id.i587:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I587()).addToBackStack(null).commit();
                return true;
            case R.id.i5m42:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I5M42()).addToBackStack(null).commit();
                return true;
            case R.id.i851:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I851()).addToBackStack(null).commit();
                return true;
            case R.id.i852:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I852()).addToBackStack(null).commit();
                return true;
            case R.id.i853:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I853()).addToBackStack(null).commit();
                return true;
            case R.id.i861:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I861()).addToBackStack(null).commit();
                return true;
            case R.id.i862:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I862()).addToBackStack(null).commit();
                return true;
            case R.id.i871:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I871()).addToBackStack(null).commit();
                return true;
            case R.id.i872:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I872()).addToBackStack(null).commit();
                return true;
            case R.id.i881:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I881()).addToBackStack(null).commit();
                return true;
            case R.id.i882:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I882()).addToBackStack(null).commit();
                return true;
            case R.id.i8m31:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I8M31()).addToBackStack(null).commit();
                return true;
            case R.id.i8m32:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I8M32()).addToBackStack(null).commit();
                return true;
            case R.id.i8m41:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I8m41()).addToBackStack(null).commit();
                return true;
            case R.id.i941:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I941()).addToBackStack(null).commit();
                return true;
            case R.id.i951:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I951()).addToBackStack(null).commit();
                return true;
            case R.id.i952:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I952()).addToBackStack(null).commit();
                return true;
            case R.id.i953:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I953()).addToBackStack(null).commit();
                return true;
            case R.id.i954:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I954()).addToBackStack(null).commit();
                return true;
            case R.id.i955:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I955()).addToBackStack(null).commit();
                return true;
            case R.id.i956:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I956()).addToBackStack(null).commit();
                return true;
            case R.id.i957:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I957()).addToBackStack(null).commit();
                return true;
            case R.id.i958:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I958()).addToBackStack(null).commit();
                return true;
            case R.id.i961:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I961()).addToBackStack(null).commit();
                return true;
            case R.id.i962:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I962()).addToBackStack(null).commit();
                return true;
            case R.id.i963:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I963()).addToBackStack(null).commit();
                return true;
            case R.id.i964:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I964()).addToBackStack(null).commit();
                return true;
            case R.id.i965:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I965()).addToBackStack(null).commit();
                return true;
            case R.id.i966:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I966()).addToBackStack(null).commit();
                return true;
            case R.id.i967:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I967()).addToBackStack(null).commit();
                return true;
            case R.id.i971:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I971()).addToBackStack(null).commit();
                return true;
            case R.id.i972:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I972()).addToBackStack(null).commit();
                return true;
            case R.id.i973:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I973()).addToBackStack(null).commit();
                return true;
            case R.id.i974:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I974()).addToBackStack(null).commit();
                return true;
            case R.id.i975:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I975()).addToBackStack(null).commit();
                return true;
            case R.id.i976:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I976()).addToBackStack(null).commit();
                return true;
            case R.id.i977:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I977()).addToBackStack(null).commit();
                return true;
            case R.id.i981:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I981()).addToBackStack(null).commit();
                return true;
            case R.id.i983:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I983()).addToBackStack(null).commit();
                return true;
            case R.id.i985:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I985()).addToBackStack(null).commit();
                return true;
            case R.id.i9m31:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I9M31()).addToBackStack(null).commit();
                return true;
            case R.id.i9m33:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I9M33()).addToBackStack(null).commit();
                return true;
            case R.id.i9m41:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new I9M41()).addToBackStack(null).commit();
                return true;
            case R.id.vi437:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new ВИ437()).addToBackStack(null).commit();
                return true;
            case R.id.vi947:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new ВИ947()).addToBackStack(null).commit();
                return true;
            case R.id.e141:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E141()).addToBackStack(null).commit();
                return true;
            case R.id.e142:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E142()).addToBackStack(null).commit();
                return true;
            case R.id.e151:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E151()).addToBackStack(null).commit();
                return true;
            case R.id.e152:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E152()).addToBackStack(null).commit();
                return true;
            case R.id.e153:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E153()).addToBackStack(null).commit();
                return true;
            case R.id.e161:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E161()).addToBackStack(null).commit();
                return true;
            case R.id.e162:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E162()).addToBackStack(null).commit();
                return true;
            case R.id.e163:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E163()).addToBackStack(null).commit();
                return true;
            case R.id.e171:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E171()).addToBackStack(null).commit();
                return true;
            case R.id.e172:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E172()).addToBackStack(null).commit();
                return true;
            case R.id.e173:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E173()).addToBackStack(null).commit();
                return true;
            case R.id.e181:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E181()).addToBackStack(null).commit();
                return true;
            case R.id.e1m31:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E1M31()).addToBackStack(null).commit();
                return true;
            case R.id.e251:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E251()).addToBackStack(null).commit();
                return true;
            case R.id.e252:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E252()).addToBackStack(null).commit();
                return true;
            case R.id.e261:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E261()).addToBackStack(null).commit();
                return true;
            case R.id.e262:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E262()).addToBackStack(null).commit();
                return true;
            case R.id.e271:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E271()).addToBackStack(null).commit();
                return true;
            case R.id.e272:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E272()).addToBackStack(null).commit();
                return true;
            case R.id.e281:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E281()).addToBackStack(null).commit();
                return true;
            case R.id.e282:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E282()).addToBackStack(null).commit();
                return true;
            case R.id.e2m31:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E2M31()).addToBackStack(null).commit();
                return true;
            case R.id.e2m41:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E2M41()).addToBackStack(null).commit();
                return true;
            case R.id.e341:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E341()).addToBackStack(null).commit();
                return true;
            case R.id.e342:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E342()).addToBackStack(null).commit();
                return true;
            case R.id.e351:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E351()).addToBackStack(null).commit();
                return true;
            case R.id.e352:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E352()).addToBackStack(null).commit();
                return true;
            case R.id.e361:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E361()).addToBackStack(null).commit();
                return true;
            case R.id.e362:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E362()).addToBackStack(null).commit();
                return true;
            case R.id.e371:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E371()).addToBackStack(null).commit();
                return true;
            case R.id.e372:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E372()).addToBackStack(null).commit();
                return true;
            case R.id.e381:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E381()).addToBackStack(null).commit();
                return true;
            case R.id.e382:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E382()).addToBackStack(null).commit();
                return true;
            case R.id.e441:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E441()).addToBackStack(null).commit();
                return true;
            case R.id.e451:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E451()).addToBackStack(null).commit();
                return true;
            case R.id.e452:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E452()).addToBackStack(null).commit();
                return true;
            case R.id.e453:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E453()).addToBackStack(null).commit();
                return true;
            case R.id.e461:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E461()).addToBackStack(null).commit();
                return true;
            case R.id.e462:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E462()).addToBackStack(null).commit();
                return true;
            case R.id.e463:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E463()).addToBackStack(null).commit();
                return true;
            case R.id.e464:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E464()).addToBackStack(null).commit();
                return true;
            case R.id.e471:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E471()).addToBackStack(null).commit();
                return true;
            case R.id.e472:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E472()).addToBackStack(null).commit();
                return true;
            case R.id.e473:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E473()).addToBackStack(null).commit();
                return true;
            case R.id.e474:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E474()).addToBackStack(null).commit();
                return true;
            case R.id.e481:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E481()).addToBackStack(null).commit();
                return true;
            case R.id.e482:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E482()).addToBackStack(null).commit();
                return true;
            case R.id.e483:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E483()).addToBackStack(null).commit();
                return true;
            case R.id.e484:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E484()).addToBackStack(null).commit();
                return true;
            case R.id.e4m31:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E4M31()).addToBackStack(null).commit();
                return true;
            case R.id.e4m41:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E4M41()).addToBackStack(null).commit();
                return true;
            case R.id.e641:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E641()).addToBackStack(null).commit();
                return true;
            case R.id.e651:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E651()).addToBackStack(null).commit();
                return true;
            case R.id.e652:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E652()).addToBackStack(null).commit();
                return true;
            case R.id.e661:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E661()).addToBackStack(null).commit();
                return true;
            case R.id.e662:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E662()).addToBackStack(null).commit();
                return true;
            case R.id.e671:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E671()).addToBackStack(null).commit();
                return true;
            case R.id.e672:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E672()).addToBackStack(null).commit();
                return true;
            case R.id.e681:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E681()).addToBackStack(null).commit();
                return true;
            case R.id.e682:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E682()).addToBackStack(null).commit();
                return true;
            case R.id.e6m31:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E6M31()).addToBackStack(null).commit();
                return true;
            case R.id.e6m41:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E6M41()).addToBackStack(null).commit();
                return true;
            case R.id.e751:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E751()).addToBackStack(null).commit();
                return true;
            case R.id.e761:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E761()).addToBackStack(null).commit();
                return true;
            case R.id.e771:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E771()).addToBackStack(null).commit();
                return true;
            case R.id.e781:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E781()).addToBackStack(null).commit();
                return true;
            case R.id.e782:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E782()).addToBackStack(null).commit();
                return true;
            case R.id.e7m41:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new E7M41()).addToBackStack(null).commit();
                return true;
            case R.id.ve246:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new BE246()).addToBackStack(null).commit();
            case R.id.ve256:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new BE256()).addToBackStack(null).commit();
                return true;
            case R.id.ve446:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new BE446()).addToBackStack(null).commit();
                return true;
            case R.id.ve456:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new BE456()).addToBackStack(null).commit();
                return true;
            case R.id.ve466:
                getFragmentManager().beginTransaction().replace(R.id.container,
                        new BE466()).addToBackStack(null).commit();
                return true;


        }
        return super.onContextItemSelected(item);
    }
}
